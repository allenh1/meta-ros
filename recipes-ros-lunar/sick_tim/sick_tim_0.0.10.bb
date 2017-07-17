# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS driver for the SICK TiM series of laser scanners."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin diagnostic_updater dynamic_reconfigure libusb-1.0 libusb-1.0-dev roscpp sensor_msgs"
SRC_URI = "https://github.com/uos-gbp/sick_tim-release/archive/release/lunar/sick_tim/0.0.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2c300a69e414733a12979a640197f905"
SRC_URI[sha256sum] = "92fd33517938e4fbde7d05bc93eeb3546970016c29889c16698c605b9095b6aa"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
