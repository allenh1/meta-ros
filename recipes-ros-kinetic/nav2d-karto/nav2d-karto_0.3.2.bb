# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Graph-based Simultaneous Localization and Mapping module.     Includes OpenKarto"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native eigen geometry-msgs nav2d-localizer nav2d-msgs nav-msgs roscpp suitesparse tbb tf visualization-msgs"
SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/kinetic/nav2d_karto/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d2beeda0eee25c7f1b07146236811888"
SRC_URI[sha256sum] = "e9aaba2fc88c8ffb4abfa03d60bf299e3663da41a5f953ecb65939e5af6677d3"
S = "${WORKDIR}/navigation_2d-release-release-kinetic-nav2d_karto-0.3.2-0"

inherit catkin
