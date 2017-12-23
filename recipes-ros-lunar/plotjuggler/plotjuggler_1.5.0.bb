# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "PlotJuggler: juggle with data"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=a9a72c186797ff98a79f90205c589abf"

DEPENDS = "binutils catkin-native libqt5-svg-dev qtbase5-dev ros-type-introspection rosbag rosbag-storage roscpp roscpp-serialization rostime topic-tools"
SRC_URI = "https://github.com/facontidavide/${PN}-release/archive/release/lunar/${PN}/1.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5b7e88e175882fff6a1bb9161d401088"
SRC_URI[sha256sum] = "695c5ced217af762e5a92836a5cb0f93689523aaced2ebf334bdecfd1793d025"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-1.5.0-0"

inherit catkin
