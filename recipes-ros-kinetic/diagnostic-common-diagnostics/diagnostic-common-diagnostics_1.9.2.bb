# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "diagnostic_common_diagnostics"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-updater hddtemp python-psutil rospy rostest tf"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/kinetic/diagnostic_common_diagnostics/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0658e6be36f349f9cbaf36153274f630"
SRC_URI[sha256sum] = "f7626ab9df831ce2dab76121bbd8f76474fba6f93e9195998379fd013bca42ab"
S = "${WORKDIR}/diagnostics-release-release-kinetic-diagnostic_common_diagnostics-1.9.2-0"

inherit catkin
