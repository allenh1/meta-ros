# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A wrapper for keeping rqt programs alive."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-qt-binding qt-gui-py-common rocon-console rocon-python-utils rosgraph rqt-gui rqt-gui-py rqt-plot rqt-reconfigure rqt-robot-monitor"
SRC_URI = "https://github.com/yujinrobot-release/rqt_wrapper-release/archive/release/kinetic/rqt_wrapper/0.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bd4cad765d143976dc732c3d60655e89"
SRC_URI[sha256sum] = "f4e34b6add56f7f11092af35cfbaa9677d5cf658711494ae684e314829a478fa"
S = "${WORKDIR}/rqt_wrapper-release-release-kinetic-rqt_wrapper-0.1.4-0"

inherit catkin
