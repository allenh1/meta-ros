# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is used to manually control a robot that uses the operator and     "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native nav2d-navigator nav2d-operator roscpp sensor-msgs"
SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/kinetic/nav2d_remote/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "64303673be673bc08280dec6a5c3b0db"
SRC_URI[sha256sum] = "cbe3f593863b80821ae7700cd3d457c46a3118f2141b674167e51267b62acdb6"
S = "${WORKDIR}/navigation_2d-release-release-kinetic-nav2d_remote-0.3.2-0"

inherit catkin
