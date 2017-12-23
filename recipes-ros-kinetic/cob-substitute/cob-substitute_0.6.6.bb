# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_substitute"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-docker-control cob-reflector-referencing cob-safety-controller"
SRC_URI = "https://github.com/ipa320/cob_substitute-release/archive/release/kinetic/cob_substitute/0.6.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b1f75586a8ba9a3287086f565d50f9e2"
SRC_URI[sha256sum] = "b0b0c1e314da4accae0f6991f1d83ac6767aab6812febc207cc6764c6849b866"
S = "${WORKDIR}/cob_substitute-release-release-kinetic-cob_substitute-0.6.6-0"

inherit catkin
