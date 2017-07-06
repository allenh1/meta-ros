# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "actionlib_msgs catkin geometry_msgs message_generation"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_msgs/0.5.15-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6bb164936ff8da8186bc7ab6c7df702d"
SRC_URI[sha256sum] = "3589d7a74e4a79d474d13efbca10e563797efa549719d109478fb119a17250f6"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
