# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pluginlib package provides tools for writing and dynamically loading plugins"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native class-loader cmake-modules rosconsole roslib libtinyxml2"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/1.11.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "aab9b6ef1618a2ff554868f8ea92e5c4"
SRC_URI[sha256sum] = "5e3deb4f797d22a9e01b937d54cb0f03596788a2559e2c3b7c1495e0069b495a"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-1.11.2-0"

inherit catkin
