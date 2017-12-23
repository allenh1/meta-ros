# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages used in the XPP framework."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/kinetic/xpp_msgs/1.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cf54319f44cf58902e792393f0997cbd"
SRC_URI[sha256sum] = "e0980ed794d889687fd1d6a5ddceff654d99386d6bfd002e5c7c1125ac37737e"
S = "${WORKDIR}/xpp-release-release-kinetic-xpp_msgs-1.0.3-0"

inherit catkin
