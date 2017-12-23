# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains sensor related launch files.     The package also includes"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native laser-assembler pcl-ros roscpp sensor-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-PPC-release/archive/release/kinetic/thormang3_sensors/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9bb92e7005c724f5fca2a408cbcb18dc"
SRC_URI[sha256sum] = "09c4e03892e8c6aabb7d9ecccacba046d956a7838f83db766208f008dc9ba5fa"
S = "${WORKDIR}/ROBOTIS-THORMANG-PPC-release-release-kinetic-thormang3_sensors-0.1.2-0"

inherit catkin
