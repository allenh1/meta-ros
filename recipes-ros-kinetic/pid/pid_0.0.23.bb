# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch a PID control node."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure message-generation message-runtime roscpp std-msgs"
SRC_URI = "https://github.com/AndyZe/${PN}-release/archive/release/kinetic/${PN}/0.0.23-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "210841b0468034eff609c12d561a7557"
SRC_URI[sha256sum] = "289371e721ed0f05416f8c5f6c46deb029d81bb72b0636e4d8023de17b38e021"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.0.23-0"

inherit catkin
