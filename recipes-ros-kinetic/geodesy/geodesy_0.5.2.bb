# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python and C++ interfaces for manipulating geodetic coordinates."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native geographic-msgs geometry-msgs python-catkin-pkg-native python-pyproj sensor-msgs tf unique-id uuid-msgs"
SRC_URI = "https://github.com/ros-geographic-info/geographic_info-release/archive/release/kinetic/${PN}/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bf383cffc0aea94c4a9b19bd11d5bcd1"
SRC_URI[sha256sum] = "c298212d2a77911d60cedfde713372bad057fbcb8307aa5f29eb976e3166ed9f"
S = "${WORKDIR}/geographic_info-release-release-kinetic-${PN}-0.5.2-0"

inherit catkin
