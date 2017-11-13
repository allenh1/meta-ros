# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MAVLink communication library.     This library provide unified connection handl"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "boost catkin-native console-bridge mavlink"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/libmavconn/0.21.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "55f01f595a2e5408fd28119a87478987"
SRC_URI[sha256sum] = "80007565198bbdaf7699b24ab72d74fb4381d9e63eb8f828cbb5ad42730bd13e"
S = "${WORKDIR}/mavros-release-release-lunar-libmavconn-0.21.4-0"

inherit catkin
