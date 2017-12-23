# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS driver for the SICK TiM series of laser scanners."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-updater dynamic-reconfigure libusb-1.0 libusb-1.0-dev roscpp sensor-msgs"
SRC_URI = "https://github.com/uos-gbp/sick_tim-release/archive/release/kinetic/sick_tim/0.0.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "38cd2e94a4e6962c2a6a60d57b1f795f"
SRC_URI[sha256sum] = "f1a503a96e035cbb14ae86ab8f9d81f4820ed0c45c4f5c605c2d2c7c34a18765"
S = "${WORKDIR}/sick_tim-release-release-kinetic-sick_tim-0.0.11-0"

inherit catkin
