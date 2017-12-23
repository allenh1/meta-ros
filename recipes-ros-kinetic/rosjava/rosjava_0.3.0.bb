# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This is a meta package for the official rosjava repositories."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native genjava rosjava-bootstrap rosjava-build-tools rosjava-core rosjava-extras rosjava-messages rosjava-test-msgs zeroconf-jmdns-suite"
SRC_URI = "https://github.com/${PN}-release/${PN}-release/archive/release/kinetic/${PN}/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b25bf0e5842f8e7c5e4879442374a8b5"
SRC_URI[sha256sum] = "3a67357648da216378519de67fe4a157c69086f4e2209c5c7813a629da9bfbd4"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.3.0-0"

inherit catkin
