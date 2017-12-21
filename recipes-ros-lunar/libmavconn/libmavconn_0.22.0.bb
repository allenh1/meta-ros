# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MAVLink communication library.     This library provide unified connection handl"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3 & LGPL-3 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "boost catkin-native console-bridge mavlink"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/${PN}/0.22.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ab814b4916b12a713d0c80523eeecdce"
SRC_URI[sha256sum] = "610089b068e119f72d2e57cb23b2d4b9bc22983c90110366b3e6c8f37c7d97d9"
S = "${WORKDIR}/mavros-release-release-lunar-${PN}-0.22.0-0"

inherit catkin
