# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides a library to STDR Simulator, to parse yaml and xml description files."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native cmake-modules roscpp roslib stdr-msgs libtinyxml yaml-cpp"
SRC_URI = "https://github.com/stdr-simulator-ros-pkg/stdr_simulator-release/archive/release/kinetic/stdr_parser/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ba778b8795950f369872822b78361ec0"
SRC_URI[sha256sum] = "8f8d08d6f47fb9a326a3a4bfa2d2d2d5cb3c08f25991bf4e169931f5be82bef0"
S = "${WORKDIR}/stdr_simulator-release-release-kinetic-stdr_parser-0.3.2-0"

inherit catkin
