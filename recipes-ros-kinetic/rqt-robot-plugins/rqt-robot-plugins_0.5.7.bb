# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage of rqt plugins that are particularly used with robots    during its "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rqt-moveit rqt-nav-view rqt-pose-view rqt-robot-dashboard rqt-robot-monitor rqt-robot-steering rqt-runtime-monitor rqt-rviz rqt-tf-tree"
SRC_URI = "https://github.com/ros-gbp/rqt_robot_plugins-release/archive/release/kinetic/rqt_robot_plugins/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "69d6e9d1c1664bc3d5bfad0bc87b3c24"
SRC_URI[sha256sum] = "5e1285f5dc2f987c461d9133d5b42b116c2512ee2d20b6ae92d99a3aac9d029a"
S = "${WORKDIR}/rqt_robot_plugins-release-release-kinetic-rqt_robot_plugins-0.5.7-0"

inherit catkin
