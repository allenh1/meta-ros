# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage of rqt plugins that are particularly used with robots    during its "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rqt-moveit rqt-nav-view rqt-pose-view rqt-robot-dashboard rqt-robot-monitor rqt-robot-steering rqt-runtime-monitor rqt-rviz rqt-tf-tree"
SRC_URI = "https://github.com/ros-gbp/rqt_robot_plugins-release/archive/release/lunar/rqt_robot_plugins/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "24bbeaeeef9da41762e61a499e97cc9c"
SRC_URI[sha256sum] = "2cc4236785fb1505100ed002d2a0da502d70e4b543f6d9e568badd2f160a5f10"
S = "${WORKDIR}/rqt_robot_plugins-release-release-lunar-rqt_robot_plugins-0.5.7-0"

inherit catkin
