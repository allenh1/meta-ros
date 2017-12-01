# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The wts_driver package"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native message-generation message-runtime roscpp std-msgs"
SRC_URI = "https://github.com/ksatyaki/wts_driver-release/archive/release/lunar/wts_driver/1.0.4-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "011e57e327c1f78e87c15fcddcdd8135"
SRC_URI[sha256sum] = "20eb36ca07d7dd9bf6e3045d04bc6d1e819646085d0d9262c06fb99ed0d07d92"
S = "${WORKDIR}/wts_driver-release-release-lunar-wts_driver-1.0.4-2"

inherit catkin
