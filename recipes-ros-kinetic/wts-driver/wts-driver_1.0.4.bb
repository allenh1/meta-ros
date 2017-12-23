# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The wts_driver package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native message-generation message-runtime roscpp std-msgs"
SRC_URI = "https://github.com/ksatyaki/wts_driver-release/archive/release/kinetic/wts_driver/1.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ca78a54395b6369fcf5ac8f2cd148122"
SRC_URI[sha256sum] = "8716cd0606b804c50ffe1ff79d1c263e85081535f5efb3606f74d01095576f19"
S = "${WORKDIR}/wts_driver-release-release-kinetic-wts_driver-1.0.4-0"

inherit catkin
