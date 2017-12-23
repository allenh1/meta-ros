# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The handeye package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=f5654d47d02d927c4f7a04f0a51abaa1"

DEPENDS = "baldor catkin-native criutils geometry-msgs message-generation message-runtime python-enum34 python-matplotlib python-numpy python-scipy std-msgs"
SRC_URI = "https://github.com/crigroup/${PN}-release/archive/release/kinetic/${PN}/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5b4fccffb38016f7a0850936b744e91c"
SRC_URI[sha256sum] = "cc3e2e04b33303648e7f7bec7484768f9f513d61869ddd21651e0e937f435bbf"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.1.0-0"

inherit catkin
