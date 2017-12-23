# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ntpd_driver sends TimeReference message time to ntpd server"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules libpoco-dev message-generation message-runtime roscpp sensor-msgs"
SRC_URI = "https://github.com/vooon/ntpd_driver-release/archive/release/kinetic/ntpd_driver/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e593bf2f1e94c411a4b937921724dd40"
SRC_URI[sha256sum] = "11b33d8f2d54be860f745d74c33076899015bd4a36769b2fbe1a1986baf59c93"
S = "${WORKDIR}/ntpd_driver-release-release-kinetic-ntpd_driver-1.2.0-0"

inherit catkin
