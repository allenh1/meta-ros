# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver for NovAtel receivers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native diagnostic-msgs diagnostic-updater gps-common libpcap nav-msgs nodelet novatel-gps-msgs roscpp sensor-msgs std-msgs swri-math-util swri-nodelet swri-roscpp swri-serial-util swri-string-util tf"
SRC_URI = "https://github.com/swri-robotics-gbp/novatel_gps_driver-release/archive/release/kinetic/novatel_gps_driver/3.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e559847a715ca91df8b82649c61482de"
SRC_URI[sha256sum] = "36d32b325e7a3375937ed5e0b1b6a789384c664a3c208cec507fac84a3fdf12b"
S = "${WORKDIR}/novatel_gps_driver-release-release-kinetic-novatel_gps_driver-3.4.0-0"

inherit catkin
