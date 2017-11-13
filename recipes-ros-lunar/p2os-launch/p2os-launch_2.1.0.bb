# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch and config files designed for use with the p2os stack."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native p2os-driver p2os-msgs p2os-teleop p2os-urdf"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/lunar/p2os_launch/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d43a87813ad14297cc3b5c5200b33836"
SRC_URI[sha256sum] = "6c079627270cfa9dec0fe64405c210a64b51266e38d4e8c7225ef34e47ba715c"
S = "${WORKDIR}/p2os-release-release-lunar-p2os_launch-2.1.0-0"

inherit catkin
