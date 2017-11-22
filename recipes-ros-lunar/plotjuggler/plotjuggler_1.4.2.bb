# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "PlotJuggler: juggle with data"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=a9a72c186797ff98a79f90205c589abf"

DEPENDS = "binutils catkin libqt5-svg-dev qtbase5-dev ros-type-introspection rosbag rosbag-storage roscpp roscpp-serialization rostime topic-tools"
SRC_URI = "https://github.com/facontidavide/plotjuggler-release/archive/release/lunar/plotjuggler/1.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "88cba97c1b6b8ac78f784f5caf68f29a"
SRC_URI[sha256sum] = "7cec27f1f480cd685253d802febc8a51a10305e04e6e0a22de9b0473cb211b2d"
S = "${WORKDIR}/plotjuggler-release-release-lunar-plotjuggler-1.4.2-0"

inherit catkin
