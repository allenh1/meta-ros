# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "nav_msgs defines the common messages used to interact with the
     stack."
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "actionlib_msgs catkin geometry_msgs message_generation message_runtime std_msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/lunar/nav_msgs/1.12.5-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f6761f9b00f317d681d5fb04d52acc0b"
SRC_URI[sha256sum] = "d4ff96f38b5ac3a6c795342bb9b3658f2f8c9baa005ed8f179ccf0a2c55afc26"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
