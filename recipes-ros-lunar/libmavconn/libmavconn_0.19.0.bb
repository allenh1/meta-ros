# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MAVLink communication library.     This library provide unified connection handl"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "boost catkin-native console-bridge mavlink"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/libmavconn/0.19.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "580c1327e14915014f500695f8b1c030"
SRC_URI[sha256sum] = "5c3fb55143db16f3ebd981771faec2aa64aa1f531b053ea02e5900bda496b56f"
S = "${WORKDIR}/mavros-release-release-lunar-libmavconn-0.19.0-0"

inherit catkin
