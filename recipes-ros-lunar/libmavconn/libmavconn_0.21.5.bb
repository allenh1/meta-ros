# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MAVLink communication library.     This library provide unified connection handl"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "boost catkin console-bridge mavlink"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/libmavconn/0.21.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8abbb6cd757c1209ebd550d0f10c277f"
SRC_URI[sha256sum] = "3c920cb4f4387b68fed186524555c12d90833de8702fdeeffbef9320718856f0"
S = "${WORKDIR}/mavros-release-release-lunar-libmavconn-0.21.5-0"

inherit catkin
