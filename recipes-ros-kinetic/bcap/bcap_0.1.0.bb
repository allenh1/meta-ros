# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "bCAP library as a ROS package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=4633480cdd27d7906aaf3ef4b72014b2"

DEPENDS = "catkin-native roscpp"
SRC_URI = "https://github.com/fsuarez6/${PN}-release/archive/release/kinetic/${PN}/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dce900ab27000fb1809197770073cb70"
SRC_URI[sha256sum] = "0950b4c4499ed1b8a308bceb0d9e3c213da753f414140253b546ca75254f8459"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.1.0-0"

inherit catkin
