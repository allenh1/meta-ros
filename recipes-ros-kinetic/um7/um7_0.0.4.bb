# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The um7 package provides a C++ implementation of the CH Robotics serial protocol"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime roscpp sensor-msgs serial"
SRC_URI = "https://github.com/ros-drivers-gbp/${PN}-release/archive/release/kinetic/${PN}/0.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "895befab4552e2e570ad686e309e3d41"
SRC_URI[sha256sum] = "96835957db572d596a12aeef84e6319b9f9f2e14876e0251542763a323ae24b4"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.0.4-0"

inherit catkin
