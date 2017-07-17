# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "RQT plugin for monitoring ROS processes."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=6ace6221ae341fc25a92c248d2a762a9"

DEPENDS = "catkin python-psutil python_qt_binding rospy rqt_gui rqt_gui_py"
SRC_URI = "https://github.com/ros-gbp/rqt_top-release/archive/release/lunar/rqt_top/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b576e3026e61080a9be283e9a7479e2f"
SRC_URI[sha256sum] = "174e6c9957adbebb06ea473dde5f3c9aa4b830d5653d4fc7e91af67be42f1253"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
