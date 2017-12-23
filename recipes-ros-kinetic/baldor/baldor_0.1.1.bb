# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The baldor package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=f5654d47d02d927c4f7a04f0a51abaa1"

DEPENDS = "catkin-native python-numpy"
SRC_URI = "https://github.com/crigroup/${PN}-release/archive/release/kinetic/${PN}/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0521fa16e078501b467543e107943fb8"
SRC_URI[sha256sum] = "42297f480b4ac56f63cd4e876004fe4f0414974d757b7f1f3c33c70a8a2a6dbd"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.1.1-0"

inherit catkin
