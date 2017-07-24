# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The State Machine Compiler (SMC) from http://smc.sourceforge.net/     converts a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Mozilla-Public-License-Version-1.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=e1b5a50d4dd59d8102e41a7a2254462d"

DEPENDS = "python-empy-native"
SRC_URI = "https://github.com/ros-gbp/bond_core-release/archive/release/lunar/smclib/1.7.19-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "186714f0b17e07b3b344667aaab8b724"
SRC_URI[sha256sum] = "1c122e2f2464ab5c0a114b2590bf0d88c77c829bfccb02d8973c0c6c1839856d"
S = "${WORKDIR}/bond_core-release-release-lunar-smclib-1.7.19-0"

inherit catkin
