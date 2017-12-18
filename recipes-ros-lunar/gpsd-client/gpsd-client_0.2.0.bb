# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "connects to a GPSd server and broadcasts GPS fixes     using the NavSatFix messa"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin gps-common libgps pkgconfig roscpp sensor-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/lunar/gpsd_client/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8f27ad05e59476443d6c49d171dc482e"
SRC_URI[sha256sum] = "f0c38dcd6854cd496faff9b2af9681be8365e6cc0f96d271c20fa1eef50b0506"
S = "${WORKDIR}/gps_umd-release-release-lunar-gpsd_client-0.2.0-0"

inherit catkin
