# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "diagnostic_common_diagnostics"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin diagnostic-updater hddtemp python-psutil rospy rostest tf"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/lunar/diagnostic_common_diagnostics/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "28baca764b15eb402b9030cb37b2941a"
SRC_URI[sha256sum] = "20823055ecdb24da2fae0d4ade63d2f6bfa97323ed260de3fce682b907099f6e"
S = "${WORKDIR}/diagnostics-release-release-lunar-diagnostic_common_diagnostics-1.9.2-0"

inherit catkin
