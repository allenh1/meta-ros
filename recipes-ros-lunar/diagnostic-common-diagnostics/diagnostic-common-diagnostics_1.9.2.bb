# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "diagnostic_common_diagnostics"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native diagnostic-updater hddtemp python-psutil rospy rostest tf"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/lunar/diagnostic_common_diagnostics/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "987b2a600532f51041b672e590e0b22c"
SRC_URI[sha256sum] = "200e795cfa883b844a40ee63127fc1120f12c4dcec0757bef2d8f63de872f047"
S = "${WORKDIR}/diagnostics-release-release-lunar-diagnostic_common_diagnostics-1.9.2-0"

inherit catkin
