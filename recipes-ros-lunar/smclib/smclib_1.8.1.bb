# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The State Machine Compiler (SMC) from http://smc.sourceforge.net/     converts a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Mozilla-Public-License-Version-1.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=e1b5a50d4dd59d8102e41a7a2254462d"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/bond_core-release/archive/release/lunar/smclib/1.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2f49821aa12861ebfe6c556a04557764"
SRC_URI[sha256sum] = "573d7b16be46f7623643c577c4b8ec218db8ec0599d20b4b8015d1a23c470d21"
S = "${WORKDIR}/bond_core-release-release-lunar-smclib-1.8.1-0"

inherit catkin
