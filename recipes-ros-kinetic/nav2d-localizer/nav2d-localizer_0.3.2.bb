# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around Particle Filter implementation.     The SelfLocalizer can be used"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native geometry-msgs nav-msgs roscpp sensor-msgs tf"
SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/kinetic/nav2d_localizer/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bea0314ba7f26837cc5a90fd3c3caa1e"
SRC_URI[sha256sum] = "2356fa55caad20d964941c691329ab0b8d1487b9d11ff514bdcc4fca3af7e70d"
S = "${WORKDIR}/navigation_2d-release-release-kinetic-nav2d_localizer-0.3.2-0"

inherit catkin
