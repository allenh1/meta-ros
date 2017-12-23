# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides robot and sensor descripiton files for STDR Simulator."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/stdr-simulator-ros-pkg/stdr_simulator-release/archive/release/kinetic/stdr_resources/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "daf9916698c4409c9d1847c021eeb57a"
SRC_URI[sha256sum] = "255da1ade123bb7517ef0dca68e5c5aacac0eac33f147e249df448e4fa99c960"
S = "${WORKDIR}/stdr_simulator-release-release-kinetic-stdr_resources-0.3.2-0"

inherit catkin
