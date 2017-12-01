# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage for core of rosserial."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rosserial-client rosserial-msgs rosserial-python"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a60830c4f36e8a4fe0a3e0ccdf33c670"
SRC_URI[sha256sum] = "e54ad746e16029e2791be063149a1c5fbca12f66e381660b4bd0c85d47511f7e"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-0.7.7-0"

inherit catkin
