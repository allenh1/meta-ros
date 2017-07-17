# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_rviz provides a GUI plugin embedding .
    Note that this rqt plugin does NO"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "boost catkin pluginlib qtbase5-dev rqt_gui rqt_gui_cpp rviz"
SRC_URI = "https://github.com/ros-gbp/rqt_rviz-release/archive/release/lunar/rqt_rviz/0.5.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1a62ebf1eda0b2ad6ab04cd9eea74725"
SRC_URI[sha256sum] = "30fbc521c4dee52883b4524545ccc6bf05d723bafab6dde434725644a1028a42"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
