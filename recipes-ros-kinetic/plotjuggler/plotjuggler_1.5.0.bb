# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "PlotJuggler: juggle with data"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=a9a72c186797ff98a79f90205c589abf"

DEPENDS = "binutils catkin-native libqt5-svg-dev qtbase5-dev ros-type-introspection rosbag rosbag-storage roscpp roscpp-serialization rostime topic-tools"
SRC_URI = "https://github.com/facontidavide/${PN}-release/archive/release/kinetic/${PN}/1.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5bf390d402786deb021aedf3459c9b83"
SRC_URI[sha256sum] = "8370eff428026987a2d8badac5ea5175fa8026ca8c17eff6046b849c6c120d61"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.5.0-0"

inherit catkin
