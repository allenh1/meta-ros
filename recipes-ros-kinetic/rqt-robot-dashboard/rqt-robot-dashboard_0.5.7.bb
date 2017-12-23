# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_robot_dashboard provides an infrastructure for building robot dashboard plug"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs python-qt-binding qt-gui rospy rqt-console rqt-gui rqt-gui-py rqt-nav-view rqt-robot-monitor"
SRC_URI = "https://github.com/ros-gbp/rqt_robot_dashboard-release/archive/release/kinetic/rqt_robot_dashboard/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c18cd8a655013b35f9af546b9b1e692e"
SRC_URI[sha256sum] = "7f52846bd254213b9f245b0be802ff07701f3e57742ca0a13c1ffbeb262116cd"
S = "${WORKDIR}/rqt_robot_dashboard-release-release-kinetic-rqt_robot_dashboard-0.5.7-0"

inherit catkin
