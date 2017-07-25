# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roslang is a common package that all  depend on.     This is mainly used to find"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genmsg"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/roslang/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "be1c9cd27df934fd60003510ac5381e5"
SRC_URI[sha256sum] = "9341639a6ed9c0e3a2e6f53df5aebf90372070f02bfcc2ada2e2f298d4ad42f0"
S = "${WORKDIR}/ros-release-release-lunar-roslang-1.14.0-0"

inherit catkin
