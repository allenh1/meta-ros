# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver for NovAtel receivers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin diagnostic-msgs diagnostic-updater gps-common libpcap nav-msgs nodelet novatel-gps-msgs roscpp sensor-msgs std-msgs swri-math-util swri-nodelet swri-roscpp swri-serial-util swri-string-util tf"
SRC_URI = "https://github.com/swri-robotics-gbp/novatel_gps_driver-release/archive/release/lunar/novatel_gps_driver/3.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "34d0d382e413bed90a96fc7238e88257"
SRC_URI[sha256sum] = "69663bd30a470b3bb440ac3778430a45f67b55f289e6fe5591301471731bfb48"
S = "${WORKDIR}/novatel_gps_driver-release-release-lunar-novatel_gps_driver-3.4.0-0"

inherit catkin
