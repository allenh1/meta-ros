# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package attempts to show the features of ROS step-by-step,     including us"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin message_generation message_runtime rosconsole roscpp roscpp_serialization rostime std_msgs"
SRC_URI = "https://github.com/ros-gbp/ros_tutorials-release/archive/release/lunar/roscpp_tutorials/0.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "529a7098a6ae9b063f47a1f7ddb168b1"
SRC_URI[sha256sum] = "1e106f9e6f8661edba104e8cfb8df6f8807571d686413c9928042c4c70abf468"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
