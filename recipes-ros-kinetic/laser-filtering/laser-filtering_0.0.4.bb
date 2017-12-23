# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS Libraries for filtering specific kinds of laser scans"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native map-laser"
SRC_URI = "https://github.com/wu-robotics/laser_filtering_release/archive/release/kinetic/laser_filtering/0.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ae1960d9abbcc1bc091594e5fdefde58"
SRC_URI[sha256sum] = "d11ec8adafb09376a7909cf735fe10bc07bfa8072895797e21c6937c3f63232b"
S = "${WORKDIR}/laser_filtering_release-release-kinetic-laser_filtering-0.0.4-0"

inherit catkin
