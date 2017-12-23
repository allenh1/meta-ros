# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A mouse teleop tool for holonomic mobile robots."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs python-numpy rospy"
SRC_URI = "https://github.com/ros-gbp/teleop_tools-release/archive/release/kinetic/mouse_teleop/0.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8e986d530c89b680a23818bcd3a68a06"
SRC_URI[sha256sum] = "4269de361f62fb89757110f7f8feca7ae695f073cec3ee820a7a6c53b4b2383c"
S = "${WORKDIR}/teleop_tools-release-release-kinetic-mouse_teleop-0.2.5-0"

inherit catkin
