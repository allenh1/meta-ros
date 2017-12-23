# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "connects to a GPSd server and broadcasts GPS fixes     using the NavSatFix messa"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gps-common libgps pkgconfig roscpp sensor-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/kinetic/gpsd_client/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5d147eab5ec7dbf1236decaa614981a4"
SRC_URI[sha256sum] = "65374d1b731fbb14f66284e274ed13089439964e40e6f827d8189bd261385eab"
S = "${WORKDIR}/gps_umd-release-release-kinetic-gpsd_client-0.2.0-0"

inherit catkin
