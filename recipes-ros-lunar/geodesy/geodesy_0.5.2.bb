# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python and C++ interfaces for manipulating geodetic coordinates."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native geographic-msgs geometry-msgs python-catkin-pkg-native python-pyproj sensor-msgs tf unique-id uuid-msgs"
SRC_URI = "https://github.com/ros-geographic-info/geographic_info-release/archive/release/lunar/${PN}/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "853be0ab676dc88aa90ebfe5c15f83be"
SRC_URI[sha256sum] = "8336ff81fc496e1cc2e3c1cd570c210f3e96fb1d6f093cffa5f6d9ddb47c32d0"
S = "${WORKDIR}/geographic_info-release-release-lunar-${PN}-0.5.2-0"

inherit catkin
