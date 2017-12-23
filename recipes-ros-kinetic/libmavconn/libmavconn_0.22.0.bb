# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MAVLink communication library.     This library provide unified connection handl"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3 & LGPL-3 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "boost catkin-native console-bridge mavlink"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/kinetic/${PN}/0.22.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1d54b379f5593a812da573c5e5a99bde"
SRC_URI[sha256sum] = "52fb08c04ac833c38507aef44bdb7dd7c6065e198479dab320dc13cf266d1eb8"
S = "${WORKDIR}/mavros-release-release-kinetic-${PN}-0.22.0-0"

inherit catkin
