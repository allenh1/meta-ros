# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=7;endline=7;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin geometry_msgs message_generation message_runtime std_msgs"
SRC_URI = "https://github.com/ros-gbp/pr2_common-release/archive/release/lunar/pr2_msgs/1.12.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "253c0997dbf51dd6d75835202ff271bf"
SRC_URI[sha256sum] = "97e9d7e0dfd09ba45a5e5208958c1f26cd41e6ef025e5e3bd2b8b8a5201c72ea"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
