# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "a high-level FTP client library for Python"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin-pip"
SRC_URI = "https://github.com/asmodehn/ftputil-rosrelease/archive/release/kinetic/${PN}/3.3.0-3.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f0317cc8e8e3efdad48f514838b10446"
SRC_URI[sha256sum] = "ea7134ed605ab490095d888680edee69e8c2dfc95bb36b9fc3b8f067eb5dfc37"
S = "${WORKDIR}/ftputil-rosrelease-release-kinetic-${PN}-3.3.0-3"

inherit catkin
